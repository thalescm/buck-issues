package com.nubank.android.common.http.auth

import com.google.gson.Gson
import machado.thales.app.Person
import java.io.BufferedReader
import javax.annotation.Resource

object MockPerson {

    private fun read(resourceName: String): String {
        var resourceName = resourceName
        if (!resourceName.startsWith("/")) {
            resourceName = "/" + resourceName
        }
        return Resource::class.java.getResourceAsStream(resourceName).bufferedReader(Charsets.UTF_8).use(BufferedReader::readText)
    }

    private fun getStrForPersonName(name: String): String {
        return read("person/$name.json")
    }

    fun getInstanceForPersonName(name: String): Person {
        return Gson().fromJson<Person>(getStrForPersonName(name), Person::class.java)
    }
}
