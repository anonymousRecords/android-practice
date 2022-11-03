import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.chapdo.baemin.databinding.ItemViewBinding
import com.chapdo.baemin.item.UserData

class RecyclerItemAdapter(private val dataList: ArrayList<UserData>): RecyclerView.Adapter<RecyclerItemAdapter.DataViewHolder>(){
    // ViewHolder 객체
    inner class DataViewHolder(private  val viewBinding: ItemViewBinding): RecyclerView.ViewHolder(viewBinding.root){
        fun bind(data: UserData){
            viewBinding.RCMyTownStore.text = data.store
            viewBinding.RCMyTownRate.text = data.rate
            viewBinding.RCMyTownTipPrice.text = data.tip_price
        }
    }
    // ViewHolder 만들어질 때 실행할 동작
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val viewBinding = ItemViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DataViewHolder(viewBinding)
    }
    // ViewHolder가 실제로 데이터를 표시해야할 때 호출되는 함수
    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(dataList[position])
    }
    // 표현할 Item의 총 개수
    override fun getItemCount(): Int = dataList.size
}