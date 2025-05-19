package org.davy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Project: md46
 * Package: org.davy
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 19/05/2025
 * Time: 10:24
 * <p>
 */
public class Gulosos {
    
    interface Betch {
        int[] getFileSizes();
        int getTapeSize();
    }

    private static class NewBatch implements Betch {

        @Override
        public int[] getFileSizes() {
            return new int[] {
                    70,10,20
            };
        }

        @Override
        public int getTapeSize() {
            return 100;
        }

    }

    public class Tape{
        private int stored;
        private int numberOfFiles;

        public Tape(int stored){
            this.stored = stored;
            this.numberOfFiles = 1;
        }

        public int getStored() {
            return stored;
        }

        public void addStored(int stored) {
            this.stored += stored;
        }

        public void addFiles(){
            this.numberOfFiles++;
        }


        public int getNumberOfFiles() {
            return numberOfFiles;
        }


    }

    public int getMinTapeCount(final Betch betch) {
        int[] size = betch.getFileSizes();
        Arrays.sort(size);

        int tapes = 0;
        List<Tape> list = new ArrayList<>();


        for (int i = size.length - 1; i > -1; i--) {
            boolean stored = false;

            for (Tape tape : list){
                if (((tape.getStored() + size[i]) <= betch.getTapeSize()) && (tape.getNumberOfFiles() < 2)) {
                    tape.addStored(size[i]);
                    tape.addFiles();
                    stored = true;
                    break;
                }
            }

            if (!stored) {
                tapes++;
                list.add(new Tape(size[i]));
            }
        }

        return tapes;
    }

}
