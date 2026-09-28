package u0;

import J2.InterfaceC0328z;
import a0.AbstractC0427d;
import a0.C0425b;
import a0.InterfaceC0431h;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import c0.AbstractC0571K;
import l0.C0813a;
import m2.C0880v;

/* loaded from: classes.dex */
public final class r extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11133i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1314v f11134j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(C1314v c1314v, int i2) {
        super(1);
        this.f11133i = i2;
        this.f11134j = c1314v;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f11133i) {
            case 0:
                KeyEvent keyEvent = ((l0.b) obj).f8278a;
                C1314v c1314v = this.f11134j;
                c1314v.getClass();
                long C3 = l0.c.C(keyEvent);
                C0425b c0425b = C0813a.a(C3, C0813a.f8270h) ? new C0425b(keyEvent.isShiftPressed() ? 2 : 1) : C0813a.a(C3, C0813a.f8268f) ? new C0425b(4) : C0813a.a(C3, C0813a.f8267e) ? new C0425b(3) : (C0813a.a(C3, C0813a.f8265c) || C0813a.a(C3, C0813a.f8273k)) ? new C0425b(5) : (C0813a.a(C3, C0813a.f8266d) || C0813a.a(C3, C0813a.f8274l)) ? new C0425b(6) : (C0813a.a(C3, C0813a.f8269g) || C0813a.a(C3, C0813a.f8271i) || C0813a.a(C3, C0813a.f8275m)) ? new C0425b(7) : (C0813a.a(C3, C0813a.f8264b) || C0813a.a(C3, C0813a.f8272j)) ? new C0425b(8) : null;
                if (c0425b == null || !C1.y.r(l0.c.D(keyEvent), 2)) {
                    return Boolean.FALSE;
                }
                b0.d x2 = c1314v.x();
                InterfaceC0431h focusOwner = c1314v.getFocusOwner();
                C1305q c1305q = new C1305q(c0425b, 1);
                int i2 = c0425b.f6453a;
                Boolean c3 = ((androidx.compose.ui.focus.b) focusOwner).c(i2, x2, c1305q);
                if (c3 == null || c3.booleanValue()) {
                    return Boolean.TRUE;
                }
                if (!C0425b.a(i2, 1) && !C0425b.a(i2, 2)) {
                    return Boolean.FALSE;
                }
                Integer J3 = AbstractC0427d.J(i2);
                if (J3 == null) {
                    throw new IllegalStateException("Invalid focus direction".toString());
                }
                int intValue = J3.intValue();
                Rect y3 = x2 != null ? AbstractC0571K.y(x2) : null;
                if (y3 == null) {
                    throw new IllegalStateException("Invalid rect".toString());
                }
                View view = c1314v;
                while (true) {
                    if (view != null) {
                        FocusFinder focusFinder = FocusFinder.getInstance();
                        View rootView = c1314v.getRootView();
                        z2.h.d(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                        view = focusFinder.findNextFocus((ViewGroup) rootView, view, intValue);
                        if (view != null) {
                            if (!z2.h.a(view, c1314v)) {
                                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                                    if (parent == c1314v) {
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        view = null;
                    }
                }
                if (!(!z2.h.a(view, c1314v))) {
                    view = null;
                }
                if ((view == null || !AbstractC0427d.E(view, Integer.valueOf(intValue), y3)) && ((androidx.compose.ui.focus.b) c1314v.getFocusOwner()).a(i2, false, false)) {
                    Boolean c4 = ((androidx.compose.ui.focus.b) c1314v.getFocusOwner()).c(i2, null, new C1305q(c0425b, 0));
                    return Boolean.valueOf(c4 != null ? c4.booleanValue() : true);
                }
                return Boolean.TRUE;
            case 1:
                y2.a aVar = (y2.a) obj;
                C1314v c1314v2 = this.f11134j;
                Handler handler = c1314v2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar.c();
                } else {
                    Handler handler2 = c1314v2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new R0.v(aVar, 1));
                    }
                }
                return C0880v.f8657a;
            default:
                C1314v c1314v3 = this.f11134j;
                return new U(c1314v3, c1314v3.getTextInputService(), (InterfaceC0328z) obj);
        }
    }
}
