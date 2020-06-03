package com.example.roomlesson

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "product")
class Product (
    @PrimaryKey val  id: Int,
    @ColumnInfo(name = "product_name") val productName:String,
    @ColumnInfo(name = "product_price") val productPrice:String,
    @ColumnInfo(name = "product_description") val productDescription:String
)