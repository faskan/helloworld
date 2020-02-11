package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method(GET())
        url '/'
    }
    response {
        status(200)
        body(
                id: "faskan",
                firstName: "Faisal",
                lastName: "Khan"
        )
    }
}