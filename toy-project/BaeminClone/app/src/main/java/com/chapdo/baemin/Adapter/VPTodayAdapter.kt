import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.chapdo.baemin.R

class VPTodayAdapter(TodayDiscountList: ArrayList<Int>) : RecyclerView.Adapter<VPTodayAdapter.PagerViewHolder>()  {
    var item = TodayDiscountList

    // 표현할 Item의 총 개수
    override fun getItemCount(): Int = item.size

    // ViewHolder 객체
    inner class PagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val todayDiscountimg = itemView.findViewById<ImageView>(R.id.today_discount_img)
    }

    // ViewHolder가 실제로 데이터를 표시해야할 때 호출되는 함수
    override fun onBindViewHolder(holder: VPTodayAdapter.PagerViewHolder, position: Int) {
        holder.todayDiscountimg.setImageResource(item[position])
    }

    // ViewHolder가 실제로 데이터를 표시해야할 때 호출되는 함수
    override fun onCreateViewHolder(view: ViewGroup, viewType: Int): VPTodayAdapter.PagerViewHolder {
        val view = LayoutInflater.from(view.context).inflate(R.layout.item_today_discount_view, view, false)
        return PagerViewHolder(view)
    }
}