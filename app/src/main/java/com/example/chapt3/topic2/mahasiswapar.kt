package com.example.chapt3.topic2

import android.os.Parcel
import android.os.Parcelable

data class mahasiswapar(val nama: String?, val nim: String?, val jurusan: String?) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nama)
        parcel.writeString(nim)
        parcel.writeString(jurusan)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<mahasiswapar> {
        override fun createFromParcel(parcel: Parcel): mahasiswapar {
            return mahasiswapar(parcel)
        }

        override fun newArray(size: Int): Array<mahasiswapar?> {
            return arrayOfNulls(size)
        }
    }
}
