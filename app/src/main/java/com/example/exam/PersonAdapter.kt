package com.example.exam;

import android.graphics.ColorSpace.Model
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.exam.DataHolder
import com.example.exam.databinding.PersonItemBinding


class PersonAdapter(private val activityFunctions: ActivityFunctions): RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {
    private var personList = DataHolder.dataList

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = PersonItemBinding.inflate(inflater, parent, false)
        return PersonViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        val person = personList[position]



        with(holder.binding) {

            avatar.setImageResource(person.pictureRes)
            tvName.text = person.name
            tvSurname.text = person.surname
            tvDescription.text = person.minimalInfo

        }
    }

    override fun getItemCount(): Int {
        return personList.size
    }

    class PersonViewHolder(var binding: PersonItemBinding): RecyclerView.ViewHolder(binding.root)
}



