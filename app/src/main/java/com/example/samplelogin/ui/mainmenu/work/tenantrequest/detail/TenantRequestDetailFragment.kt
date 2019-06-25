package com.example.samplelogin.ui.mainmenu.work.tenantrequest.detail

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.samplelogin.R

class TenantRequestDetailFragment : Fragment() {

    companion object {
        fun newInstance() = TenantRequestDetailFragment()
    }

    private lateinit var viewModel: TenantRequestDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.tenant_request_detail_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(TenantRequestDetailViewModel::class.java)
        // TODO: Use the ViewModel
    }

}