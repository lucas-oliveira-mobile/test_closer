package br.com.lucasoliveira.codigospostais.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.lucasoliveira.codigospostais.R
import br.com.lucasoliveira.codigospostais.models.PostalCodes
import kotlinx.android.synthetic.main.postal_codes_item.view.*

class PostalCodesAdapter () : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: List<PostalCodes> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return PostalCodesViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.postal_codes_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when(holder) {

            is PostalCodesViewHolder -> {
                holder.bind(items[position])
            }
        }
    }

    override fun getItemCount(): Int {

        return items.size
    }

    fun setDataSet(postalCodes: List<PostalCodes>) {

        this.items = postalCodes
    }

    class PostalCodesViewHolder constructor(

        itemView: View
    ): RecyclerView.ViewHolder(itemView) {

        private var postalCode = itemView.postal_code_value
        private var postalExtencion = itemView.postal_extension_value
        private var postalDesignition = itemView.postal_designation_title

        fun bind(postalCodes: PostalCodes) {

            postalCode.text = postalCodes.codPostal
            postalExtencion.text = postalCodes.postalExtencion
            postalDesignition.text = postalCodes.postalDesignation
        }
    }
}