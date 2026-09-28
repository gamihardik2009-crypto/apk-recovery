package K1;

import android.database.Cursor;
import android.graphics.Matrix;
import android.view.View;
import androidx.work.impl.WorkDatabase;
import c0.AbstractC0571K;
import c0.C0565E;
import java.util.Set;
import m2.C0880v;
import n2.AbstractC0946A;
import r1.v;
import u0.InterfaceC1284f0;
import u0.N;

/* loaded from: classes.dex */
public final class e implements S.m, InterfaceC1284f0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4536a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4537b;

    public e(WorkDatabase workDatabase) {
        this.f4536a = workDatabase;
        this.f4537b = new b(workDatabase, 1);
    }

    @Override // S.m
    public Object a(S.b bVar, Object obj) {
        return ((y2.e) this.f4536a).j(bVar, obj);
    }

    @Override // u0.InterfaceC1284f0
    public void b(View view, float[] fArr) {
        C0565E.d(fArr);
        h(view, fArr);
    }

    @Override // S.m
    public Object c(Object obj) {
        return ((y2.c) this.f4537b).l(obj);
    }

    public Long d(String str) {
        v a3 = v.a("SELECT long_value FROM Preference where `key`=?", 1);
        a3.p(str, 1);
        r1.r rVar = (r1.r) this.f4536a;
        rVar.b();
        Cursor p3 = AbstractC0946A.p(rVar, a3, false);
        try {
            Long l3 = null;
            if (p3.moveToFirst() && !p3.isNull(0)) {
                l3 = Long.valueOf(p3.getLong(0));
            }
            return l3;
        } finally {
            p3.close();
            a3.c();
        }
    }

    public void e(d dVar) {
        r1.r rVar = (r1.r) this.f4536a;
        rVar.b();
        rVar.c();
        try {
            ((b) this.f4537b).g(dVar);
            rVar.o();
        } finally {
            rVar.j();
        }
    }

    public void f(Set set) {
        ((L2.k) this.f4537b).q(C0880v.f8657a);
    }

    public void g(C1.o oVar, int i2) {
        z2.h.f(oVar, "workSpecId");
        ((N1.b) this.f4537b).a(new L1.p((C1.i) this.f4536a, oVar, false, i2));
    }

    public void h(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z3 = parent instanceof View;
        float[] fArr2 = (float[]) this.f4536a;
        if (z3) {
            h((View) parent, fArr);
            C0565E.d(fArr2);
            C0565E.h(-view.getScrollX(), -view.getScrollY(), 0.0f, fArr2);
            N.z(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            C0565E.d(fArr2);
            C0565E.h(left, top, 0.0f, fArr2);
            N.z(fArr, fArr2);
        } else {
            int[] iArr = (int[]) this.f4537b;
            view.getLocationInWindow(iArr);
            C0565E.d(fArr2);
            C0565E.h(-view.getScrollX(), -view.getScrollY(), 0.0f, fArr2);
            N.z(fArr, fArr2);
            float f3 = iArr[0];
            float f4 = iArr[1];
            C0565E.d(fArr2);
            C0565E.h(f3, f4, 0.0f, fArr2);
            N.z(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        AbstractC0571K.v(matrix, fArr2);
        N.z(fArr, fArr2);
    }

    public e(C1.i iVar, N1.b bVar) {
        z2.h.f(iVar, "processor");
        z2.h.f(bVar, "workTaskExecutor");
        this.f4536a = iVar;
        this.f4537b = bVar;
    }

    public e(y2.e eVar, y2.c cVar) {
        this.f4536a = eVar;
        this.f4537b = cVar;
    }

    public e(String[] strArr, L2.g gVar) {
        this.f4537b = gVar;
        z2.h.f(strArr, "tables");
        this.f4536a = strArr;
    }

    public e(float[] fArr) {
        this.f4536a = fArr;
        this.f4537b = new int[2];
    }
}
