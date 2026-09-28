package u0;

import V.n;
import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1;
import j.C0746b;
import j.C0751g;
import s.AbstractC1166e;
import t0.AbstractC1248f;
import u0.ViewOnDragListenerC1307r0;

/* renamed from: u0.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnDragListenerC1307r0 implements View.OnDragListener, Y.a {

    /* renamed from: a, reason: collision with root package name */
    public final Y.d f11135a = new Y.d();

    /* renamed from: b, reason: collision with root package name */
    public final C0751g f11136b = new C0751g(0);

    /* renamed from: c, reason: collision with root package name */
    public final DragAndDropModifierOnDragListener$modifier$1 f11137c = new t0.S() { // from class: androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1
        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return ViewOnDragListenerC1307r0.this.f11135a.hashCode();
        }

        @Override // t0.S
        public final n l() {
            return ViewOnDragListenerC1307r0.this.f11135a;
        }

        @Override // t0.S
        public final /* bridge */ /* synthetic */ void m(n nVar) {
        }
    };

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        B.F f3 = new B.F(11, dragEvent);
        int action = dragEvent.getAction();
        t0.o0 o0Var = t0.o0.f10610h;
        Y.d dVar = this.f11135a;
        switch (action) {
            case 1:
                dVar.getClass();
                z2.o oVar = new z2.o();
                Y.c cVar = new Y.c(f3, dVar, oVar);
                if (cVar.l(dVar) == o0Var) {
                    AbstractC1248f.z(dVar, cVar);
                }
                boolean z3 = oVar.f11905h;
                C0751g c0751g = this.f11136b;
                c0751g.getClass();
                C0746b c0746b = new C0746b(c0751g);
                while (c0746b.hasNext()) {
                    ((Y.d) c0746b.next()).O0(f3);
                }
                break;
            case 2:
                dVar.N0(f3);
                break;
            case 4:
                dVar.getClass();
                A0.n nVar = new A0.n(21, f3);
                if (nVar.l(dVar) == o0Var) {
                    AbstractC1248f.z(dVar, nVar);
                    break;
                }
                break;
            case AbstractC1166e.f10138f /* 5 */:
                dVar.L0(f3);
                break;
            case AbstractC1166e.f10136d /* 6 */:
                dVar.M0(f3);
                break;
        }
        return false;
    }
}
