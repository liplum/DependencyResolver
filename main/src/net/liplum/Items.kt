package net.liplum

import net.liplum.annotations.DependOn

object Items {
    lateinit var stick: Any
    lateinit var bottle: Any
    lateinit var backpack: Any
    lateinit var lighter: Any
    @DependOn("Blocks.grass", "Blocks.tree")
    fun stick() {
        println("stick")
    }
    @DependOn("Blocks.sand","Liquids.water")
    fun bottle() {
        println("bottle")
    }
    @DependOn
    fun backpack() {
        println("backpack")
    }
    @DependOn("Blocks.grass")
    fun waterPurifier() {
    }
    @DependOn("Blocks.tree")
    fun lighter() {
        println("lighter")
    }
    @DependOn("Liquids.milk")
    fun cheese(){
        println("Say cheese!")
    }
}