import { Link } from "react-router-dom";


function Navbar(){
    return(<div>
         <nav className="navbar navbar-expand-lg navbar-light bg-light">
            <div className="container-fluid">
                <Link to="/" style={{ textDecoration: 'none' }}>
                <div className="navbar-brand">Veebipood</div>
                </Link>
                <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span className="navbar-toggler-icon"></span>
                </button>
                <div className="collapse navbar-collapse" id="navbarNav">
                <ul className="navbar-nav">
                    <li className="nav-item">
                    <div className="nav-link active" aria-current="page" href="#">Home</div>
                    </li>
                    <Link to="lisa" style={{ textDecoration: 'none' }}>
                    <li className="nav-item">
                    <div className="nav-link" >Lisa toode</div>
                    </li>
                    </Link>
                    <Link to="halda" style={{ textDecoration: 'none' }}>
                    <li className="nav-item">
                    <div className="nav-link" >Halda tooteid</div>
                    </li>
                    </Link>
                    <Link to="ostukorv" style={{ textDecoration: 'none' }}>
                    <li className="nav-item">
                    <div className="nav-link ">Ostukorvi</div>
                    </li>
                    </Link>

                </ul>
                </div>
            </div>
        </nav>
    </div>)
}

export default Navbar;