package aura.projects.core.network

sealed class ActionResult<out S> {
    data class Success<S>(val data: S?) : ActionResult<S>()

    data class Error<E>(val errors: CallException) : ActionResult<E>()
}
