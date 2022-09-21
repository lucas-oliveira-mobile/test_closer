package br.com.lucasoliveira.codigospostais.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.lucasoliveira.codigospostais.R
import br.com.lucasoliveira.codigospostais.models.States
import kotlinx.android.synthetic.main.states_item.view.*

class StatesAdapter(private val onItemCliked: (States) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: List<States> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return StatesViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.states_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when(holder) {

            is StatesViewHolder -> {
                holder.bind(items[position], onItemCliked)
            }
        }
    }

    override fun getItemCount(): Int {

        return items.size
    }

    class StatesViewHolder constructor(

        itemView: View
    ): RecyclerView.ViewHolder(itemView) {

        private var state = itemView.state_name


        fun bind(states: States, onItemCliked: (States) -> Unit) {

            state.text = states.codDistrito

            itemView.setOnClickListener {

                onItemCliked(states)
            }
        }
    }
}