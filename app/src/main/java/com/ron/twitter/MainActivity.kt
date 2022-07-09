package com.ron.twitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ron.twitter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displaytweet()
    }
    fun displaytweet(){
        var tweet1=Contacts("@abinsinguzaDall2","Abinsinguza Dallen","","","hello my nice how's home","344","","","576","","646")
        var tweet2=Contacts("@niwenyesigaSpe","Niwenyesiga Speria","","","NRM party appointed museveni to the representative","45","","","567","","65")
        var tweet3=Contacts("@anenaBit","Anena Beatrace","","","","66","am happy for today","","566","","45")
        var tweet4=Contacts("@niwabiineSe","Niwabiine Seth","","","","78","hello my nice how's home","","56","","65",)
        var tweet5=Contacts("@ampumuzaMon","Ampumuza Monic","","","","45","hello how's school","","4","","646")
        var tweet6=Contacts("@joshaumunu","joshu Muhumuza","","34","","4","hello my nice how's home","","4","","4")
        var tweet7=Contacts("@marykam","Mary kamukama","","33","","44","hello my nice how's home","","5","","4")
        var tweet8=Contacts("@kamugistsar","kamugisha sarah","","44","","45","hello my nice how's home","","56","","55")
        var tweet9=Contacts("@valaryuhu","Valary Uhuru","","44","","46","yesu nimunywani wangye","","43k","","4665k")
        var tweet10=Contacts("@wendyoreng","wendy Orengo","","44","","6","Robina Nabanja a new speaker","","65","","56")
        var tweet11=Contacts("@puude","Prudence Ahibwe","","34","","54","Software developers are the best","","55","","7575")
        var tweet12=Contacts("@yryufjjd","jonhe krmmm","","5","hello my nice how's home","6","hello mirip iriri odgddd","","55","","76")

        var twiterList= listOf(tweet1,tweet2,tweet3,tweet4,tweet5,tweet6,tweet7,tweet8,tweet9,tweet10,tweet11,tweet12)
        var contactsAdaptor=twiterRvAdaptor(twiterList)
        binding.rvtwiterContact.layoutManager= LinearLayoutManager(this)
        binding.rvtwiterContact.adapter=contactsAdaptor

    }
}