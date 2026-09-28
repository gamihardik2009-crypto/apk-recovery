package R0;

import D.O;
import java.util.ArrayList;
import java.util.List;
import n2.AbstractC0963o;
import n2.C0971w;
import r0.AbstractC1103Q;
import r0.InterfaceC1093G;
import r0.InterfaceC1094H;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;

/* loaded from: classes.dex */
public final class f implements InterfaceC1094H {

    /* renamed from: b, reason: collision with root package name */
    public static final f f5402b = new f(0);

    /* renamed from: c, reason: collision with root package name */
    public static final f f5403c = new f(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5404a;

    public /* synthetic */ f(int i2) {
        this.f5404a = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // r0.InterfaceC1094H
    public final InterfaceC1095I f(InterfaceC1096J interfaceC1096J, List list, long j3) {
        Object obj;
        int i2;
        switch (this.f5404a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList.add(((InterfaceC1093G) list.get(i3)).a(j3));
                }
                int i4 = 1;
                AbstractC1103Q abstractC1103Q = null;
                if (arrayList.isEmpty()) {
                    obj = null;
                } else {
                    obj = arrayList.get(0);
                    int i5 = ((AbstractC1103Q) obj).f9834h;
                    int u3 = AbstractC0963o.u(arrayList);
                    if (1 <= u3) {
                        int i6 = 1;
                        while (true) {
                            Object obj2 = arrayList.get(i6);
                            int i7 = ((AbstractC1103Q) obj2).f9834h;
                            if (i5 < i7) {
                                obj = obj2;
                                i5 = i7;
                            }
                            if (i6 != u3) {
                                i6++;
                            }
                        }
                    }
                }
                AbstractC1103Q abstractC1103Q2 = (AbstractC1103Q) obj;
                int j4 = abstractC1103Q2 != null ? abstractC1103Q2.f9834h : O0.a.j(j3);
                if (!arrayList.isEmpty()) {
                    ?? r22 = arrayList.get(0);
                    int i8 = ((AbstractC1103Q) r22).f9835i;
                    int u4 = AbstractC0963o.u(arrayList);
                    boolean z3 = r22;
                    if (1 <= u4) {
                        while (true) {
                            Object obj3 = arrayList.get(i4);
                            int i9 = ((AbstractC1103Q) obj3).f9835i;
                            r22 = z3;
                            if (i8 < i9) {
                                r22 = obj3;
                                i8 = i9;
                            }
                            if (i4 != u4) {
                                i4++;
                                z3 = r22;
                            }
                        }
                    }
                    abstractC1103Q = r22;
                }
                AbstractC1103Q abstractC1103Q3 = abstractC1103Q;
                return interfaceC1096J.C(j4, abstractC1103Q3 != null ? abstractC1103Q3.f9835i : O0.a.i(j3), C0971w.f9166h, new O(1, arrayList));
            default:
                int size2 = list.size();
                C0971w c0971w = C0971w.f9166h;
                int i10 = 0;
                if (size2 == 0) {
                    return interfaceC1096J.C(0, 0, c0971w, c.f5393n);
                }
                if (size2 == 1) {
                    AbstractC1103Q a3 = ((InterfaceC1093G) list.get(0)).a(j3);
                    return interfaceC1096J.C(a3.f9834h, a3.f9835i, c0971w, new C.h(a3, 3));
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    arrayList2.add(((InterfaceC1093G) list.get(i11)).a(j3));
                }
                int u5 = AbstractC0963o.u(arrayList2);
                if (u5 >= 0) {
                    int i12 = 0;
                    i2 = 0;
                    while (true) {
                        AbstractC1103Q abstractC1103Q4 = (AbstractC1103Q) arrayList2.get(i10);
                        i12 = Math.max(i12, abstractC1103Q4.f9834h);
                        i2 = Math.max(i2, abstractC1103Q4.f9835i);
                        if (i10 != u5) {
                            i10++;
                        } else {
                            i10 = i12;
                        }
                    }
                } else {
                    i2 = 0;
                }
                return interfaceC1096J.C(i10, i2, c0971w, new O(2, arrayList2));
        }
    }
}
