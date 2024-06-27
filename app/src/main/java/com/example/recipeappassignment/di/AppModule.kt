package com.example.recipeappassignment.di

import com.example.recipeappassignment.homescreen.repository.IPopularRecipesRepository
import com.example.recipeappassignment.homescreen.repository.PopularRecipesRepository
import com.example.recipeappassignment.homescreen.service.IPopularRecipesService
import com.example.recipeappassignment.homescreen.usecase.GetPopularRecipesUseCase
import com.example.recipeappassignment.homescreen.usecase.IGetPopularRecipesUseCase
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideRetrofit() : Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.spoonacular.com/recipes/")
            .addConverterFactory(ScalarsConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun providesPopularRecipesService(retrofit: Retrofit) : IPopularRecipesService {
        return retrofit.create(IPopularRecipesService::class.java)
    }

    @Module
    @InstallIn(SingletonComponent::class)
    interface AppModuleInt {

        @Binds
        @Singleton
        fun providePopularRecipesRepository(repo: PopularRecipesRepository) : IPopularRecipesRepository


        @Binds
        @Singleton
        fun providePopularRecipesUseCase(useCase: GetPopularRecipesUseCase) : IGetPopularRecipesUseCase
    }

}