package D;

import J.InterfaceC0258c0;
import android.os.Build;
import androidx.compose.foundation.MagnifierElement;
import m2.C0880v;
import n.n0;
import n.p0;

/* loaded from: classes.dex */
public final class d0 extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f829i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ O0.b f830j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f831k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(O0.b bVar, InterfaceC0258c0 interfaceC0258c0, int i2) {
        super(1);
        this.f829i = i2;
        this.f830j = bVar;
        this.f831k = interfaceC0258c0;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f829i) {
            case 0:
                long j3 = ((O0.g) obj).f5140a;
                float b3 = O0.g.b(j3);
                O0.b bVar = this.f830j;
                this.f831k.setValue(new O0.j(l0.c.e(bVar.l(b3), bVar.l(O0.g.a(j3)))));
                return C0880v.f8657a;
            default:
                V.l lVar = V.l.f5857b;
                A0.v vVar = new A0.v((y2.a) obj, 1);
                d0 d0Var = new d0(this.f830j, this.f831k, 0);
                if (n.b0.a()) {
                    return n.b0.a() ? new MagnifierElement(vVar, null, d0Var, Float.NaN, true, 9205357640488583168L, Float.NaN, Float.NaN, true, Build.VERSION.SDK_INT == 28 ? n0.f8813a : p0.f8826a) : lVar;
                }
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }
}
