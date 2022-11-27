package kim.hsl.coroutine

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import kim.hsl.coroutine.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(){

    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 设置布局文件
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)

        // 设置数据源
        binding.viewmodel = mainViewModel

        // 设置声明周期管理器
        binding.lifecycleOwner = this

        // 设置点击事件
        binding.button.setOnClickListener {
            // 更新 mainViewModel 数据
            mainViewModel.setStudentData()
        }
    }
}