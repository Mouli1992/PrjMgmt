package com.example.projectmanagement

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.ViewModelProvider
import com.example.projectmanagement.db.FirestoreCallback
import com.example.projectmanagement.model.*
import com.example.projectmanagement.model.ProjectDetails
import com.example.projectmanagement.table.TaskTableViewAdaptor
import com.example.projectmanagement.utils.TableHeader
import de.codecrafters.tableview.TableView

class TeamMemberTaskList : AppCompatActivity() {
    private lateinit var managerName : EditText
    private lateinit var projectStatus : EditText
    private lateinit var taskTableView : TableView<TaskDetails>
    private lateinit var projectDetailsViewModel : OneProjectDetailsViewModel
    private lateinit var context: Context
    private lateinit var teamLstTv : TableView<TeamDetails>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team_member_task_list)

        managerName = findViewById(R.id.edtProjectManagerName)
        projectStatus = findViewById(R.id.edtProjectStatus)
        //teamMemberTaskList = findViewById(R.id.txtMembersNametmtl)
        teamLstTv = findViewById(R.id.teamLstTv)
        taskTableView = findViewById(R.id.teamMemberTv)
        projectDetailsViewModel = ViewModelProvider(this).get(OneProjectDetailsViewModel::class.java)
        context = this

        intent.getStringExtra("projectId")?.let { getProjectDetails(it.toLong()) }


        //Alert dialogbox for vishal
//        val taskUpdateDialog= AlertDialog.Builder(this)
//            .setTitle("Task Upodate")
//            .setMessage("Are you sure you want to update the status of the task")
//            .setIcon(R.drawable.ic_dialog_image)
//            .setPositiveButton("yes"){_,_ ->
//            Toast.makeText(this,"You updated the task status",Toast.LENGTH_SHORT).show()
//            }
//            .setNegativeButton("No"){_,_ ->
//                Toast.makeText(this,"The task status wasnt updated",Toast.LENGTH_SHORT).show()
//            }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.heading_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menuLogout-> Intent(this@TeamMemberTaskList, MainActivity::class.java).also {
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK )
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                startActivity(it)

            }

            R.id.menuHome-> Intent(this@TeamMemberTaskList, ListingProjectTeamMember::class.java).also {
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                startActivity(it)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun getProjectDetails(projectId : Long) {
        projectDetailsViewModel.getOneProjectDetails(object : FirestoreCallback {
            override fun onTeamMemberListCallBack(teamMemberLst: MutableList<String>) {
                TODO("Not yet implemented")
            }

            override fun onProjectDetailsCallback(projectDetails: MutableList<ProjectDetails>) {
                TODO("Not yet implemented")
            }

            override fun onOneProjectDetailsCallback(projectDetails: ProjectDetails) {
                taskTableView.columnCount=3
                var taskLst = projectDetails.taskLst
                val adapter = TaskTableViewAdaptor(context,taskLst,taskTableView)
                taskTableView.dataAdapter = adapter
                taskTableView.headerAdapter = TableHeader.getTaskTableHeader(context, "")
                teamLstTv.columnCount=1
                teamLstTv.headerAdapter = TableHeader.getTeamLstTableHeader(context,"")
                val teamDetails = getTeamDetails(projectDetails.teamLst)
                val teamLstAdaptor = TeamLstTableAdaptor(context,teamDetails,teamLstTv)
                teamLstTv.dataAdapter = teamLstAdaptor
                //teamLstTv.dataAdapter = SimpleTableDataAdapter(MutableList(projectDetails.teamLst))
                managerName.setText("Manager Name :"+projectDetails.projectName.toString())
                projectStatus.setText("Project Status"+projectDetails.projectStatus.toString())
                managerName.isEnabled=false
                projectStatus.isEnabled=false
            }

            override fun onTeamMemberProjectCallback(projectDetails: MutableList<ProjectDetails>) {
                TODO("Not yet implemented")
            }
        }, projectId = projectId)

    }

    private fun getTeamDetails(teamLst: MutableList<String>?): MutableList<TeamDetails> {
        val teamDetailsLst :MutableList<TeamDetails> = mutableListOf()
        if (teamLst != null) {
            for(team in teamLst){
                teamDetailsLst.add(TeamDetails(team))
            }
        }
        println("teamDetailsLst :: $teamDetailsLst")
        return teamDetailsLst
    }

}