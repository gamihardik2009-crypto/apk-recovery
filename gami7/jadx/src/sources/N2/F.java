package N2;

import M2.O;
import M2.b0;

/* loaded from: classes.dex */
public final class F extends O implements b0 {
    @Override // M2.b0
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.f4825o;
            z2.h.c(objArr);
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.f4826p + ((int) ((q() + this.f4827r) - this.f4826p))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }

    public final void x(int i2) {
        synchronized (this) {
            Object[] objArr = this.f4825o;
            z2.h.c(objArr);
            d(Integer.valueOf(((Number) objArr[((int) ((this.f4826p + ((int) ((q() + this.f4827r) - this.f4826p))) - 1)) & (objArr.length - 1)]).intValue() + i2));
        }
    }
}
