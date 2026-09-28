package o1;

import androidx.lifecycle.EnumC0465n;
import androidx.lifecycle.InterfaceC0470t;
import java.util.List;
import m.r0;
import n1.C0945f;

/* loaded from: classes.dex */
public final class m extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0945f f9257i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f9258j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f9259k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(List list, C0945f c0945f, boolean z3) {
        super(1);
        this.f9257i = c0945f;
        this.f9258j = z3;
        this.f9259k = list;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        final boolean z3 = this.f9258j;
        final List list = this.f9259k;
        final C0945f c0945f = this.f9257i;
        androidx.lifecycle.r rVar = new androidx.lifecycle.r() { // from class: o1.l
            @Override // androidx.lifecycle.r
            public final void d(InterfaceC0470t interfaceC0470t, EnumC0465n enumC0465n) {
                boolean z4 = z3;
                List list2 = list;
                C0945f c0945f2 = c0945f;
                if (z4 && !list2.contains(c0945f2)) {
                    list2.add(c0945f2);
                }
                if (enumC0465n == EnumC0465n.ON_START && !list2.contains(c0945f2)) {
                    list2.add(c0945f2);
                }
                if (enumC0465n == EnumC0465n.ON_STOP) {
                    list2.remove(c0945f2);
                }
            }
        };
        c0945f.f9034o.a(rVar);
        return new r0(c0945f, 3, rVar);
    }
}
