package ipvc.estg.myapplication.Repository

import androidx.lifecycle.MutableLiveData
import com.google.firebase.database.*
import ipvc.estg.myapplication.Models.UserM
import ipvc.estg.myapplication.User

class UserRepository {

    private val databaseReference : DatabaseReference = FirebaseDatabase.getInstance().getReference("Utilizador")

    @Volatile private var INSTANCE : UserRepository ?= null

    fun getInstance() : UserRepository{
        return INSTANCE ?: synchronized(this){

            val instance = UserRepository()
            INSTANCE = instance
            instance
        }
    }

    fun loadUsers(userList: MutableLiveData<List<UserM>>){

        databaseReference.addValueEventListener(object: ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {

                try{

                    val _userList : List<UserM> = snapshot.children.map { dataSnapshot ->

                        dataSnapshot.getValue(UserM::class.java)!!

                    }

                    userList.postValue(_userList)

                }catch (e : java.lang.Exception){

                }

            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }


        })
    }


}