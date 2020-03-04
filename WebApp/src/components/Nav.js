import React from 'react';
import styles from '../styles/navbar.module.scss'

function Nav() {
  return (
    <div className={styles.nav}>
      <h3>Shup</h3>
      <div className={styles.rightItems}>
        <h3>Account</h3>
        <h3>Shop</h3>
        <h3>About</h3>
      </div>
    </div>
  );
}

export default Nav;

