import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.chapdo.baemin.R

class VPMyTownADAdapter(myTownAdList: ArrayList<Int>) : RecyclerView.Adapter<VPMyTownADAdapter.PagerViewHolder>()  {
    var item = myTownAdList

    // 표현할 Item의 총 개수
    override fun getItemCount(): Int = item.size

    // ViewHolder 객체
    inner class PagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val mytownadimg = itemView.findViewById<ImageView>(R.id.my_town_ad_img)
    }

    // ViewHolder가 실제로 데이터를 표시해야할 때 호출되는 함수
    override fun onBindViewHolder(holder: VPMyTownADAdapter.PagerViewHolder, position: Int) {
        holder.mytownadimg.setImageResource(item[position])
    }

    // ViewHolder가 실제로 데이터를 표시해야할 때 호출되는 함수
    override fun onCreateViewHolder(view: ViewGroup, viewType: Int): VPMyTownADAdapter.PagerViewHolder {
        val view = LayoutInflater.from(view.context).inflate(R.layout.item_my_town_ad_view, view, false)
        return PagerViewHolder(view)
    }
}