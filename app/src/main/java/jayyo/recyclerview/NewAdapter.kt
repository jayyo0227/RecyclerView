package jayyo.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

class NewAdapter() : RecyclerView.Adapter<NewAdapter.NewViewHolder>() {
//    private val list = ('0').rangeTo('Z').toList()
    private val list = (1..100).toList()

    class NewViewHolder(layout: View): RecyclerView.ViewHolder(layout) {
        val item: Button = layout.findViewById(R.id.item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewViewHolder {
        val layout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.recyclerview_item, parent, false)

        return NewViewHolder(layout)
    }

    override fun onBindViewHolder(holder: NewViewHolder, position: Int) {
        holder.item.text = list[position].toString()
        holder.item.setOnClickListener(null)
    }

    override fun getItemCount(): Int {
        return list.size
    }

}