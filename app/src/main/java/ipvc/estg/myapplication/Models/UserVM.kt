package ipvc.estg.myapplication.Models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ipvc.estg.myapplication.Repository.UserRepository

class UserVM : ViewModel() {

    private val repository : UserRepository
    private val _allUsers = MutableLiveData<List<UserM>>()
    val allUsers : LiveData<List<UserM>> = _allUsers


    init {
        repository = UserRepository().getInstance()
        repository.loadUsers(_allUsers)
    }

}