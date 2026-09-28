package H;

import java.util.ArrayList;
import java.util.List;
import m2.C0880v;
import n2.AbstractC0963o;
import r0.AbstractC1102P;
import r0.AbstractC1103Q;
import r0.InterfaceC1096J;
import s.AbstractC1173l;
import s.C1165d;

/* renamed from: H.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0106g extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f2592i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1096J f2593j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f2594k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2595l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List f2596m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0106g(ArrayList arrayList, InterfaceC1096J interfaceC1096J, float f3, int i2, ArrayList arrayList2) {
        super(1);
        this.f2592i = arrayList;
        this.f2593j = interfaceC1096J;
        this.f2594k = f3;
        this.f2595l = i2;
        this.f2596m = arrayList2;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        InterfaceC1096J interfaceC1096J;
        AbstractC1102P abstractC1102P = (AbstractC1102P) obj;
        List list = this.f2592i;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) list.get(i2);
            int size2 = list2.size();
            int[] iArr = new int[size2];
            int i3 = 0;
            while (true) {
                interfaceC1096J = this.f2593j;
                if (i3 >= size2) {
                    break;
                }
                iArr[i3] = ((AbstractC1103Q) list2.get(i3)).f9834h + (i3 < AbstractC0963o.u(list2) ? interfaceC1096J.l(this.f2594k) : 0);
                i3++;
            }
            C1165d c1165d = AbstractC1173l.f10150b;
            int[] iArr2 = new int[size2];
            for (int i4 = 0; i4 < size2; i4++) {
                iArr2[i4] = 0;
            }
            c1165d.c(interfaceC1096J, this.f2595l, iArr, interfaceC1096J.getLayoutDirection(), iArr2);
            int size3 = list2.size();
            for (int i5 = 0; i5 < size3; i5++) {
                AbstractC1102P.d(abstractC1102P, (AbstractC1103Q) list2.get(i5), iArr2[i5], ((Number) this.f2596m.get(i2)).intValue());
            }
        }
        return C0880v.f8657a;
    }
}
