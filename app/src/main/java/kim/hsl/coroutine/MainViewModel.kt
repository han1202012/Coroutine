package kim.hsl.coroutine

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel() : ViewModel() {
    // 在布局文件中配置的属性
    val student = MutableLiveData<Student>()

    // 该方法用于刷新数据
    fun setStudentData() {
        viewModelScope.launch {
            student.value = Student("Tom", 18)
        }
    }
}

data class Student(val name: String, val age: Int)