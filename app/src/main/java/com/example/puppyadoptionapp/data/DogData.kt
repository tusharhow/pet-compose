package com.example.puppyadoptionapp.data
import com.example.puppyadoptionapp.R

data class PetData(
    val id:Int,
    val name:String,
    val sex:String,

    val age: Int,
    val weight: Double,
    val imagePath: Int,
    val desc:String,
)


var PetList = mutableListOf<PetData>(
    PetData(0,"Bobby","Male",2,1.3, R.drawable.puppy1,"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"),
    PetData(1,"Leia","Female",1,1.1, R.drawable.puppy2,"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"),
    PetData(2,"Rex","Male",4,3.0, R.drawable.puppy3,"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"),
    PetData(3,"Melo","Male",2,1.1, R.drawable.puppy4,"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"),
    PetData(4,"Shuya","Male",1,2.8, R.drawable.puppy5,"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"),
    PetData(5,"Maki","Female",1,1.8, R.drawable.puppy6,"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"),
    PetData(6,"Kiba","Male",2,1.0, R.drawable.puppy7,"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"),
    PetData(7,"Kurama","Male",2,1.0, R.drawable.puppy8,"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"),

)