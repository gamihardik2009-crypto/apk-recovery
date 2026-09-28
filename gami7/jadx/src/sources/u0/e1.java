package u0;

import J.C0295v0;
import J.C0303z0;
import J2.InterfaceC0328z;
import android.view.View;
import com.example.bulksmsscheduler.R;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class e1 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f11046l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0303z0 f11047m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ View f11048n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(C0303z0 c0303z0, View view, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f11047m = c0303z0;
        this.f11048n = view;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((e1) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new e1(this.f11047m, this.f11048n, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f11046l;
        C0880v c0880v = C0880v.f8657a;
        C0303z0 c0303z0 = this.f11047m;
        View view = this.f11048n;
        try {
            if (i2 == 0) {
                C1.y.J(obj);
                this.f11046l = 1;
                Object j3 = M2.P.j(c0303z0.f4317r, new C0295v0(2, null), this);
                if (j3 != enumC1145a) {
                    j3 = c0880v;
                }
                if (j3 == enumC1145a) {
                    return enumC1145a;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1.y.J(obj);
            }
            if (n1.b(view) == c0303z0) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
            return c0880v;
        } finally {
            if (n1.b(view) == c0303z0) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
        }
    }
}
