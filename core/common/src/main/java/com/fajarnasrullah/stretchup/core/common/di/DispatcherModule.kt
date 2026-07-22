package com.fajarnasrullah.stretchup.core.common.di

import com.fajarnasrullah.stretchup.core.common.dispatcher.DefaultDispatcherProvider
import com.fajarnasrullah.stretchup.core.common.dispatcher.DispatcherProvider
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DispatcherModule {

    @Binds
    abstract fun bindDispatcherProvider(
        impl: DefaultDispatcherProvider
    ): DispatcherProvider
}