package J;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: J.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0272j0 implements Parcelable.ClassLoaderCreator {
    public static C0274k0 a(Parcel parcel, ClassLoader classLoader) {
        W w2;
        if (classLoader == null) {
            classLoader = C0272j0.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            w2 = W.f4106j;
        } else if (readInt == 1) {
            w2 = W.f4109m;
        } else {
            if (readInt != 2) {
                throw new IllegalStateException("Unsupported MutableState policy " + readInt + " was restored");
            }
            w2 = W.f4107k;
        }
        return new C0274k0(readValue, w2);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        return new C0274k0[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }
}
