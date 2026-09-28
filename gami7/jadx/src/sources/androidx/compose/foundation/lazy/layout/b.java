package androidx.compose.foundation.lazy.layout;

import D.G;
import H.C0148m;
import J.C0275l;
import J.C0285q;
import J.InterfaceC0258c0;
import J.W0;
import K1.s;
import V.o;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;
import m.C0823a;
import m2.C0880v;
import r0.AbstractC1108W;
import r0.C1111Z;
import v.AbstractC1338J;
import v.C1337I;
import v.RunnableC1348b;
import v.w;
import y2.e;
import y2.f;
import z2.i;

/* loaded from: classes.dex */
public final class b extends i implements f {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1337I f6664i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f6665j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e f6666k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ W0 f6667l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C1337I c1337i, o oVar, e eVar, InterfaceC0258c0 interfaceC0258c0) {
        super(3);
        this.f6664i = c1337i;
        this.f6665j = oVar;
        this.f6666k = eVar;
        this.f6667l = interfaceC0258c0;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        o oVar;
        S.c cVar = (S.c) obj;
        C0285q c0285q = (C0285q) obj2;
        ((Number) obj3).intValue();
        Object K3 = c0285q.K();
        Object obj4 = C0275l.f4150a;
        if (K3 == obj4) {
            K3 = new w(cVar, new G(this.f6667l, 7));
            c0285q.e0(K3);
        }
        w wVar = (w) K3;
        Object K4 = c0285q.K();
        if (K4 == obj4) {
            K4 = new C1111Z(new s(wVar));
            c0285q.e0(K4);
        }
        C1111Z c1111z = (C1111Z) K4;
        C1337I c1337i = this.f6664i;
        if (c1337i != null) {
            c0285q.U(205264983);
            c0285q.U(6622915);
            View view = (View) c0285q.l(AndroidCompositionLocals_androidKt.f6785f);
            boolean g3 = c0285q.g(view);
            Object K5 = c0285q.K();
            if (g3 || K5 == obj4) {
                K5 = new RunnableC1348b(view);
                c0285q.e0(K5);
            }
            Object obj5 = (RunnableC1348b) K5;
            c0285q.r(false);
            Object[] objArr = {c1337i, wVar, c1111z, obj5};
            boolean g4 = c0285q.g(c1337i) | c0285q.i(wVar) | c0285q.i(c1111z) | c0285q.i(obj5);
            Object K6 = c0285q.K();
            if (g4 || K6 == obj4) {
                Object c0823a = new C0823a(c1337i, wVar, c1111z, obj5, 3);
                c0285q.e0(c0823a);
                K6 = c0823a;
            }
            y2.c cVar2 = (y2.c) K6;
            boolean z3 = false;
            for (Object obj6 : Arrays.copyOf(objArr, 4)) {
                z3 |= c0285q.g(obj6);
            }
            Object K7 = c0285q.K();
            if (z3 || K7 == obj4) {
                c0285q.e0(new J.G(cVar2));
            }
            c0285q.r(false);
        } else {
            c0285q.U(205858881);
            c0285q.r(false);
        }
        int i2 = AbstractC1338J.f11292b;
        o oVar2 = this.f6665j;
        if (c1337i == null || (oVar = oVar2.k(new TraversablePrefetchStateModifierElement(c1337i))) == null) {
            oVar = oVar2;
        }
        boolean g5 = c0285q.g(wVar);
        Object obj7 = this.f6666k;
        boolean g6 = g5 | c0285q.g(obj7);
        Object K8 = c0285q.K();
        if (g6 || K8 == obj4) {
            K8 = new C0148m(wVar, 19, obj7);
            c0285q.e0(K8);
        }
        AbstractC1108W.c(c1111z, oVar, (e) K8, c0285q, 8, 0);
        return C0880v.f8657a;
    }
}
