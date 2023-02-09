package com.example.firstnetworkapi.model.domain

import android.os.Parcel
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.firstnetworkapi.model.SchoolsItem
import com.google.gson.annotations.SerializedName

@Entity
data class Schools(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
     val city: String,
     val dbn: String,
     val latitude: String,
     val location: String,
     val longitude: String,
     val overview_paragraph: String,
     val schoolEmail: String,
     val schoolName: String,
     val phoneNumber: String,
     val stateCode: String,
     val subway: String,
     val totalStudents: String,
     val transfer: String,
     val website: String,
     val zip: String,
    )
fun List<SchoolsItem>.mapToDomainSchools(): List<Schools> =
    this.map {
        Schools(
            city = it.city,
            dbn = it.dbn,
            latitude = it.dbn,
            location = it.location,
            longitude = it.longitude,
            overview_paragraph = it.overviewParagraph,
            schoolEmail = it.schoolEmail,
            schoolName = it.schoolName,
            phoneNumber = it.phoneNumber,
            stateCode = it.stateCode,
            subway = it.subway,
            totalStudents = it.totalStudents,
            transfer = it.transfer,
            website = it.website,
            zip = it.zip,

            )
    }



            )
        schools

        }
    }
}





