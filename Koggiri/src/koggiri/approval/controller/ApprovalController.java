
package koggiri.approval.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.approval.action.Action;
import koggiri.approval.action.ActionForward;
import koggiri.approval.action.ApprovalDeleteAction;
import koggiri.approval.action.ApprovalDetailRAction;
import koggiri.approval.action.ApprovalDetailSAction;
import koggiri.approval.action.ApprovalInsertAction;
import koggiri.approval.action.ApprovalInsertForm;
import koggiri.approval.action.ApprovalListAction;
import koggiri.approval.action.ApprovalUpdateAPP;
import koggiri.approval.action.ApprovalUpdateAction;
import koggiri.approval.action.ApprovalUpdateForm;

@WebServlet(urlPatterns = "*.approval")
public class ApprovalController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ApprovalController() {
		super();

	}

	public void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length() + 1);
		request.setCharacterEncoding("UTF-8");

		ActionForward forward = null;
		Action action = null;
		System.out.println(command);

		// 내가 보낸 목록 전체
		if (command.equals("approval/approval_list_s.approval")) {
			action = new ApprovalListAction("s");
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 내가 보낸 목록 진행중
		else if (command.equals("approval/approval_list_sp.approval")) {
			action = new ApprovalListAction("sp");
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 내가 보낸 목록 완료
		else if (command.equals("approval/approval_list_se.approval")) {
			action = new ApprovalListAction("se");
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 내가 보낸 목록 부결/반려
		else if (command.equals("approval/approval_list_sc.approval")) {
			action = new ApprovalListAction("sc");
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 내가 보낸 목록 임시저장
		else if (command.equals("approval/approval_list_st.approval")) {
			action = new ApprovalListAction("st");
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 내가 받은 목록 전체
		else if (command.equals("approval/approval_list_r.approval")) {
			action = new ApprovalListAction("r");
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 내가 받은 목록 기안중
		else if (command.equals("approval/approval_list_rw.approval")) {
			action = new ApprovalListAction("rw");
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 내가 받은 목록 진행중
		else if (command.equals("approval/approval_list_rp.approval")) {
			action = new ApprovalListAction("rp");
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 내가 받은 목록 완료
		else if (command.equals("approval/approval_list_re.approval")) {
			action = new ApprovalListAction("re");
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 내가 받은 목록 부결/반려
		else if (command.equals("approval/approval_list_rc.approval")) {
			action = new ApprovalListAction("rc");
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 기안 문서 폼으로
		else if (command.equals("approval/approval_insertForm.approval")) {
			action = new ApprovalInsertForm();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 기안 문서 액션
		else if (command.equals("approval/approval_insertAction.approval")) {
			action = new ApprovalInsertAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 보낸 기안 상세 액션
		else if (command.equals("approval/approval_detailSAction.approval")) {
			action = new ApprovalDetailSAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 받은 기안 상세 액션
		else if (command.equals("approval/approval_detailRAction.approval")) {
			action = new ApprovalDetailRAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 기안중인 문서 업데이트 폼
		else if (command.equals("approval/approval_updateForm.approval")) {
			action = new ApprovalUpdateForm();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 기안중인 문서 업데이트 액션
		else if (command.equals("approval/approval_updateAction.approval")) {
			action = new ApprovalUpdateAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 승인 반려/부결 액셕
		else if (command.equals("approval/approval_updateAction_App.approval")) {
			action = new ApprovalUpdateAPP();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 삭제
		else if (command.equals("approval/approval_deleteAction.approval")) {
			action = new ApprovalDeleteAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (forward != null) {
			if (forward.isRedirect()) {

				response.sendRedirect(forward.getPath());
			} else {

				RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request, response);
			}
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doProcess(request, response);
	}

}
