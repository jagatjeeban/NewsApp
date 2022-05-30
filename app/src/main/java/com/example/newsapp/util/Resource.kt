package com.example.newsapp.util

/**Sealed class is a class which restricts the class hierarchy.*/
sealed class Resource<T>(val data: T? = null, val message: String? = null) {

    class Success<T>(data: T?): Resource<T>(data)
    class Error<T>(message: String?, data: T?= null): Resource<T>(data, message)
    class Loading<T>: Resource<T>()
}