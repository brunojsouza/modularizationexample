package br.com.bruno.domain.repository

import br.com.bruno.domain.entities.AndroidJob
import io.reactivex.Observable

interface AndroidJobsRepository {

    fun getJobs(forceUpdate: Boolean): Observable<List<AndroidJob>>
}