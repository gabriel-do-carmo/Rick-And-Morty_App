package com.gds.rickmortyapp.data.model.personagem.core

import androidx.room.ColumnInfo
import java.io.Serializable

data class CharacterOrigin(
    @ColumnInfo val name: String,
    @ColumnInfo val url: String
) : Serializable