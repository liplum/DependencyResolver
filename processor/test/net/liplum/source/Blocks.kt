package net.liplum.source

import com.tschuchort.compiletesting.SourceFile

val Blocks = SourceFile.kotlin("Blocks.kt","""
package net.liplum
import net.liplum.annotations.DependOn

object Blocks {
    lateinit var grass: Any
    lateinit var tree: Any
    lateinit var sand: Any
    lateinit var dirt: Any
    @DependOn("Liquids.water")
    fun grass() {
        println("grass")
    }

    @DependOn("Liquids.water")
    fun tree() {
        println("tree")
    }

    @DependOn("Blocks.dirt")
    fun sand() {
        println("sand")
    }

    @DependOn
    fun dirt() {
        println("dirt")
    }
}
""".trimIndent()
)