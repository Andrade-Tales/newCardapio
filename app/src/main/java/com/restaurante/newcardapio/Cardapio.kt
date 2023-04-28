package com.restaurante.newcardapio

import android.os.Parcel
import android.os.Parcelable

data class Cardapio(val titulo: String?, val descricao: String?, val imagem: Int) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readInt()
    ) {

    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(titulo)
        parcel.writeString(descricao)
        parcel.writeInt(imagem)

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Cardapio> {
        override fun createFromParcel(parcel: Parcel): Cardapio {
            return Cardapio(parcel)
        }

        override fun newArray(size: Int): Array<Cardapio?> {
            return arrayOfNulls(size)
        }

    }
}
