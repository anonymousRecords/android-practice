import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.chapdo.baemin.R

class VPMainADAdapter(mainAdList: ArrayList<Int>) : RecyclerView.Adapter<VPMainADAdapter.PagerViewHolder>()  {
    var item = mainAdList

    // 표현할 Item의 총 개수
    override fun getItemCount(): Int = item.size

    // ViewHolder 객체
    inner class PagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val mainadimg = itemView.findViewById<ImageView>(R.id.main_AD_img)
    }

    // ViewHolder가 실제로 데이터를 표시해야할 때 호출되는 함수
    override fun onBindViewHolder(holder: PagerViewHolder, position: Int) {
        holder.mainadimg.setImageResource(item[position])
    }

    // ViewHolder가 실제로 데이터를 표시해야할 때 호출되는 함수
    override fun onCreateViewHolder(view: ViewGroup, viewType: Int): PagerViewHolder {
        val view = LayoutInflater.from(view.context).inflate(R.layout.item_main_ad_view, view, false)
        return PagerViewHolder(view)
    }
}