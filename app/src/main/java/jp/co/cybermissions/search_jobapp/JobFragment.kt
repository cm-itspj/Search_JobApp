package jp.co.cybermissions.search_jobapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import jp.co.cybermissions.search_jobapp.databinding.FragmentJobBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class JobFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentJobBinding>(
            inflater,
            R.layout.fragment_job, container, false
        )
        return binding.root
    }
}