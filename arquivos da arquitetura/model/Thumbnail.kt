package com.opah.desafio.felipe.models

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.Expose

class Thumbnail() : Parcelable {
    @Expose
    var extension: String? = null

    @Expose
    var path: String? = null

    constructor(parcel: Parcel) : this() {
        extension = parcel.readString()
        path = parcel.readString()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(extension)
        parcel.writeString(path)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Thumbnail> {
        override fun createFromParcel(parcel: Parcel): Thumbnail {
            return Thumbnail(parcel)
        }

        override fun newArray(size: Int): Array<Thumbnail?> {
            return arrayOfNulls(size)
        }
    }

    fun getCompletePath(): String? {
        var imagePath: String? = null
        if (!path!!.contains("image_not_available")) {
            imagePath = path!!.replace(
                "http",
                "https"
            ) + "." + extension
        }

        return imagePath
    }

}