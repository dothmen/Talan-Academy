describe('template spec', () => {
  it('passes', () => {
    cy.visit('http://demo.guru99.com/test/newtours/')
    
    cy.get('[width="77"] > a').click()
    cy.get(':nth-child(2) > [style="font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;"] > input').type('dorsaf')
    cy.get(':nth-child(3) > [style="font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;"] > input').type('othmen')
    cy.get(':nth-child(4) > [style="font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;"] > input').type('27948635')
    cy.get('#userName').type('dorsafothmen12@gmail.com')
    cy.get(':nth-child(7) > [style="font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;"] > input').type('cité ghazala ariana')
    cy.get(':nth-child(8) > [style="font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;"] > input').type('cité ghazala')
    cy.get(':nth-child(9) > [style="font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;"] > input').type('tunisie')
    cy.get(':nth-child(9) > [style="font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;"] > input').type('2053')
    cy.get('select').type('tunis')
    cy.get('#email').type('dorsafothmen12@gmail.com')
    cy.get(':nth-child(14) > [style="font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;"] > input').type('Dodo27948.!')
    cy.get(':nth-child(15) > [style="font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;"] > input').type('Dodo27948.!')
    cy.get(':nth-child(17) > td > input').click()


  })
})