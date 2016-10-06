using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Data.SqlClient;

namespace ProductApplicationProject
{
    public partial class Product_Add_Form : Form
    {
        SqlConnection con = null;
        SqlCommand cmd = null;
        ConnectionClass conobj = new ConnectionClass();
        String query;

        public Product_Add_Form()
        {
            InitializeComponent();
        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void groupBox1_Enter(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            con = conobj.MyProjectConnection();
            con.Open();
            query = "insert into Product_tb values (@Prm_Pname,@Prm_Pno,@Prm_Rate)";
            cmd = new SqlCommand(query, con);
            cmd.Parameters.Add("Prm_Pname", textBox_Pname.Text);
            cmd.Parameters.Add("Prm_Pno", textBox_Pno.Text);
            cmd.Parameters.Add("Prm_Rate", textBox_Rate.Text);
            cmd.ExecuteNonQuery();
            con.Close();
            MessageBox.Show("New Product Add Successfully");
            textBox_Pname.Clear();
            textBox_Pno.Clear();
            textBox_Rate.Clear();
            textBox_Pno.Focus();   

        }

        private void button2_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
