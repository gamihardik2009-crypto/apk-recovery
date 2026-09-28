package D;

import java.util.List;
import m2.C0880v;
import n2.AbstractC0963o;
import r0.AbstractC1102P;
import r0.AbstractC1103Q;
import s.AbstractC1166e;

/* loaded from: classes.dex */
public final class O extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f753i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f754j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O(int i2, List list) {
        super(1);
        this.f753i = i2;
        this.f754j = list;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f753i) {
            case 0:
                AbstractC1102P abstractC1102P = (AbstractC1102P) obj;
                List list = this.f754j;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    AbstractC1102P.d(abstractC1102P, (AbstractC1103Q) list.get(i2), 0, 0);
                }
                break;
            case 1:
                AbstractC1102P abstractC1102P2 = (AbstractC1102P) obj;
                List list2 = this.f754j;
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    AbstractC1102P.f(abstractC1102P2, (AbstractC1103Q) list2.get(i3), 0, 0);
                }
                break;
            case 2:
                AbstractC1102P abstractC1102P3 = (AbstractC1102P) obj;
                List list3 = this.f754j;
                int u3 = AbstractC0963o.u(list3);
                if (u3 >= 0) {
                    int i4 = 0;
                    while (true) {
                        AbstractC1102P.f(abstractC1102P3, (AbstractC1103Q) list3.get(i4), 0, 0);
                        if (i4 != u3) {
                            i4++;
                        }
                    }
                }
                break;
            case 3:
                List list4 = this.f754j;
                int size3 = list4.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    ((y2.c) list4.get(i5)).l(obj);
                }
                break;
            case 4:
                this.f754j.get(((Number) obj).intValue());
                break;
            case AbstractC1166e.f10138f /* 5 */:
                this.f754j.get(((Number) obj).intValue());
                break;
            case AbstractC1166e.f10136d /* 6 */:
                this.f754j.get(((Number) obj).intValue());
                break;
            case 7:
                this.f754j.get(((Number) obj).intValue());
                break;
            case 8:
                this.f754j.get(((Number) obj).intValue());
                break;
            case AbstractC1166e.f10135c /* 9 */:
                this.f754j.get(((Number) obj).intValue());
                break;
            case AbstractC1166e.f10137e /* 10 */:
                this.f754j.get(((Number) obj).intValue());
                break;
            case 11:
                AbstractC1102P abstractC1102P4 = (AbstractC1102P) obj;
                List list5 = this.f754j;
                int size4 = list5.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    AbstractC1102P.d(abstractC1102P4, (AbstractC1103Q) list5.get(i6), 0, 0);
                }
                break;
            default:
                AbstractC1102P abstractC1102P5 = (AbstractC1102P) obj;
                List list6 = this.f754j;
                int size5 = list6.size();
                for (int i7 = 0; i7 < size5; i7++) {
                    AbstractC1102P.h(abstractC1102P5, (AbstractC1103Q) list6.get(i7), 0, 0);
                }
                break;
        }
        return C0880v.f8657a;
    }
}
