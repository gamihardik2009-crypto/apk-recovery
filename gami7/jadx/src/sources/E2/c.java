package E2;

import java.util.NoSuchElementException;
import n2.AbstractC0974z;

/* loaded from: classes.dex */
public final class c extends AbstractC0974z {

    /* renamed from: h, reason: collision with root package name */
    public final int f1079h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1080i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1081j;

    /* renamed from: k, reason: collision with root package name */
    public int f1082k;

    public c(int i2, int i3, int i4) {
        this.f1079h = i4;
        this.f1080i = i3;
        boolean z3 = false;
        if (i4 <= 0 ? i2 >= i3 : i2 <= i3) {
            z3 = true;
        }
        this.f1081j = z3;
        this.f1082k = z3 ? i2 : i3;
    }

    @Override // n2.AbstractC0974z
    public final int a() {
        int i2 = this.f1082k;
        if (i2 != this.f1080i) {
            this.f1082k = this.f1079h + i2;
        } else {
            if (!this.f1081j) {
                throw new NoSuchElementException();
            }
            this.f1081j = false;
        }
        return i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1081j;
    }
}
