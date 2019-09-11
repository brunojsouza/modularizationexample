package br.com.bruno.domain.usecases

import br.com.bruno.domain.entities.AndroidJob
import br.com.bruno.domain.repository.AndroidJobsRepository
import io.reactivex.Observable
import io.reactivex.Scheduler

class GetJobsUseCases(
    private val repository: AndroidJobsRepository,
    private val scheduler: Scheduler
) {

    fun execute(forceUpdate: Boolean): Observable<List<AndroidJob>> {
        return repository.getJobs(forceUpdate)
            .subscribeOn(scheduler)
    }
}