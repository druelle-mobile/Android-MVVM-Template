package ovh.geoffrey_druelle.android_mvvm_template.ui.generic

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import org.koin.androidx.viewmodel.ext.android.getViewModel
import ovh.geoffrey_druelle.android_mvvm_template.R
import ovh.geoffrey_druelle.android_mvvm_template.core.BaseFragment
import ovh.geoffrey_druelle.android_mvvm_template.databinding.GenericFragmentBinding

class GenericFragment : BaseFragment<GenericFragmentBinding>() {

    companion object {
        fun newInstance() = GenericFragment()
    }

    private lateinit var viewModel: GenericViewModel

    override fun getLayoutResId(): Int = R.layout.generic_fragment

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        viewModel = getViewModel()
        binding.vm = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        initObservers()

        return root
    }

    private fun initObservers() {
        viewModel.isGeneric.observe(this, Observer { boolean ->
            if (boolean) switchGenericBooleanValue()
        })
    }

    private fun switchGenericBooleanValue() {
        viewModel.switchGenericBooleanValue()
    }
}
