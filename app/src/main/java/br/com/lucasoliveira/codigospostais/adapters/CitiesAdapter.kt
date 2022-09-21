package br.com.lucasoliveira.codigospostais.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.lucasoliveira.codigospostais.R
import br.com.lucasoliveira.codigospostais.models.Cities
import kotlinx.android.synthetic.main.cities_item.view.*


class CitiesAdapter (private val onItemCliked: (Cities) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: List<Cities> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return CitiesViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.cities_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when(holder) {

            is CitiesViewHolder -> {
                holder.bind(items[position], onItemCliked)
            }
        }
    }

    override fun getItemCount(): Int {

        return items.size
    }

    class CitiesViewHolder constructor(

        itemView: View
    ): RecyclerView.ViewHolder(itemView) {

        private var city = itemView.city_name

        fun bind(cities: Cities, onItemCliked: (Cities) -> Unit) {

            city.text = cities.codConselho

            itemView.setOnClickListener {

                onItemCliked(cities)
            }
        }
    }
}